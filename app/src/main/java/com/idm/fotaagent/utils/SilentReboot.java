package com.idm.fotaagent.utils;

import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.Flavor;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class SilentReboot {
    private Path createDirectory() throws IOException {
        Path path = Paths.get("/efs/sec_efs/auto_reboot", new String[0]);
        if (!Files.exists(path, new LinkOption[0])) {
            Files.createDirectories(path, new FileAttribute[0]);
            Files.setPosixFilePermissions(path, new HashSet(Arrays.asList(PosixFilePermission.OWNER_READ, PosixFilePermission.OWNER_WRITE, PosixFilePermission.OWNER_EXECUTE, PosixFilePermission.GROUP_READ, PosixFilePermission.GROUP_WRITE, PosixFilePermission.GROUP_EXECUTE, PosixFilePermission.OTHERS_EXECUTE)));
        }
        if (Files.isDirectory(path, new LinkOption[0])) {
            return path;
        }
        throw new IOException("failed to create directory: " + path);
    }

    private boolean setStatus(String str) throws IOException {
        try {
            Path pathResolve = createDirectory().resolve("autoinstall.status");
            Files.write(pathResolve, StandardCharsets.US_ASCII.encode(str).array(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.SYNC);
            if (pathResolve.toFile().setReadable(true, false)) {
                Log.I("succeeded to set readable for " + pathResolve + "(status: " + str + ")");
                return true;
            }
            Log.E("failed to set readable for " + pathResolve + "(status: " + str + ")");
            return false;
        } catch (IOException e5) {
            Log.printStackTrace(e5);
            return false;
        }
    }

    public void disable() throws IOException {
        if (Flavor.SilentReboot.supportsSilentReboot()) {
            setStatus("NONE");
        }
    }

    public void enable() {
        if (Flavor.SilentReboot.supportsSilentReboot()) {
            setStatus("AUTO_INSTALL");
        }
    }
}
