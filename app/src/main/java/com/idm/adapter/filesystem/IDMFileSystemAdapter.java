package com.idm.adapter.filesystem;

import com.idm.adapter.logmanager.IDMDebug;
import com.idm.exception.file.IDMExceptionFileDelete;
import com.idm.exception.file.IDMExceptionFileDirCreate;
import com.idm.exception.file.IDMExceptionFileIO;
import com.idm.exception.file.IDMExceptionFileNotFound;
import com.idm.exception.file.IDMExceptionFileRead;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;

/* loaded from: classes.dex */
public class IDMFileSystemAdapter implements IDMFileSystemAdapterInterface {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$idmGetDirSize$0(Path path) {
        return Files.isRegularFile(path, new LinkOption[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ long lambda$idmGetDirSize$1(Path path) {
        return path.toFile().length();
    }

    public void idmAppendFileWrite(String str, byte[] bArr) throws IOException {
        try {
            Files.write(Paths.get(str, new String[0]), bArr, StandardOpenOption.CREATE, StandardOpenOption.APPEND, StandardOpenOption.SYNC);
        } catch (IOException e5) {
            IDMDebug.printStackTrace(e5);
        }
    }

    public void idmDirCreate(String str) throws IDMExceptionFileDirCreate {
        try {
            File file = new File(str);
            if (!file.exists() ? file.mkdirs() : true) {
            } else {
                throw new IDMExceptionFileDirCreate();
            }
        } catch (Exception e5) {
            throw new IDMExceptionFileDirCreate(e5);
        }
    }

    public void idmDirDelete(String str) throws IDMExceptionFileDelete {
        try {
            Files.walk(Paths.get(str, new String[0]), new FileVisitOption[0]).sorted(Comparator.reverseOrder()).map(new E2.b(1)).forEach(new c(0));
        } catch (IOException e5) {
            throw new IDMExceptionFileDelete(e5);
        }
    }

    public void idmFileCopy(File file, File file2) throws IOException, IDMExceptionFileIO {
        try {
            Files.copy(Paths.get(file.toURI()), Paths.get(file2.toURI()), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e5) {
            throw new IDMExceptionFileIO(e5);
        }
    }

    public void idmFileCreateWrite(String str, byte[] bArr) throws IOException {
        try {
            Files.write(Paths.get(str, new String[0]), bArr, StandardOpenOption.CREATE);
        } catch (IOException e5) {
            IDMDebug.printStackTrace(e5);
        }
    }

    public void idmFileDelete(String str) throws IDMExceptionFileDelete {
        try {
            File file = new File(str);
            if (file.exists() && !file.delete()) {
                throw new IDMExceptionFileDelete(str + " can't delete");
            }
        } catch (RuntimeException e5) {
            throw new IDMExceptionFileDelete(e5);
        }
    }

    public void idmFileExists(String str) throws IDMExceptionFileNotFound, IDMExceptionFileRead {
        File file = new File(str);
        if (!file.exists()) {
            throw new IDMExceptionFileNotFound();
        }
        if (!file.canRead()) {
            throw new IDMExceptionFileRead();
        }
    }

    public byte[] idmGetByteFromInputStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] bArr = new byte[102400];
            while (true) {
                int i5 = bufferedInputStream.read(bArr);
                if (i5 < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i5);
            }
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public long idmGetDirSize(String str) throws IDMExceptionFileNotFound {
        try {
            return Files.walk(Paths.get(str, new String[0]), new FileVisitOption[0]).filter(new a(0)).mapToLong(new b(0)).sum();
        } catch (IOException e5) {
            throw new IDMExceptionFileNotFound(e5);
        }
    }

    public long idmGetFileSize(String str) throws IDMExceptionFileNotFound {
        File file = new File(str);
        if (file.exists()) {
            return file.length();
        }
        throw new IDMExceptionFileNotFound();
    }

    public byte[] idmGetToByteFromFile(String str) {
        try {
            return Files.readAllBytes(Paths.get(str, new String[0]));
        } catch (IOException e5) {
            IDMDebug.printStackTrace(e5);
            return null;
        }
    }

    public String idmGetToStringFromFile(String str) {
        try {
            return new String(Files.readAllBytes(Paths.get(str, new String[0])), Charset.defaultCharset());
        } catch (IOException e5) {
            IDMDebug.printStackTrace(e5);
            return null;
        }
    }
}
