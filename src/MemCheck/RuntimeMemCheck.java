package MemCheck;

public class RuntimeMemCheck {

        private static String geTotalMem() {
            return "Total Mem: \t" + formatToMiB(Runtime.getRuntime().totalMemory())+ " MiB";
        }

        // Get maximum size of heap in bytes. The heap cannot grow beyond this size.// Any attempt will result in an OutOfMemoryException.
        private static String getMaxMem() {
            return "Max Mem: \t" + formatToMiB(Runtime.getRuntime().maxMemory()) + " MiB";
        }

        private static String getUncommittedMem() {
            return "Free Mem: \t" + formatToMiB(Runtime.getRuntime().freeMemory()) + " MiB";
        }

        private static String getCommittedMem() {
            return "Used Mem: \t" + formatToMiB(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())+ " MiB";
        }

        private static long formatToMiB(long toFormat) {
            return toFormat /(1024*1024);
        }

        public static String runMemCheck() {
            return getMaxMem() + "\n" + geTotalMem() + "\n" + getUncommittedMem() + "\n" + getCommittedMem() + "\n";
        }
}
