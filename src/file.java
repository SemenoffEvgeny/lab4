import java.io.*;

public class file {
        public int copy(String file1, String file2) throws IOException {
            InputStream is = null;
            OutputStream os = null;
            int speed_progress = 0;
            final int size4Mb = 4 * 1024 * 1024;
            try {
                is = new FileInputStream(file1);
                os = new FileOutputStream(file2);
                byte[] buffer = new byte[size4Mb];
                int length;
                while ((length = is.read(buffer)) > 0) {
                    os.write(buffer, 0, length);
                    speed_progress++;
                }
            } finally {
                is.close();
                os.close();
                return speed_progress;
            }
        }
    }

