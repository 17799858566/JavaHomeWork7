public class T4 {
    public static void main(String[] args) {
        StopWatch m = new StopWatch();
        m.start();
        for (int i = 0; i < 9999999; i++) {
            for (int j = 0; j < 9999999; j++) {
            }
        }
        m.stop();
        System.out.println(m.getElapsedTime());
    }
}
    class StopWatch {
        private long startTime;
        private long endTime;

        public long getStartTime() {
            return startTime;
        }

        public long getEndTime() {
            return endTime;
        }

        // 构造方法与类同名
        public StopWatch() {
            this.startTime = System.currentTimeMillis();
        }

        public void start() {
            this.startTime = System.currentTimeMillis();
        }

        public void stop() {
            this.endTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {
            return this.endTime - this.startTime;
        }
    }
