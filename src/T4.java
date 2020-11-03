public class T4 {
    public static void main(String[] args) {
        StopWatch m = new StopWatch();
        m.start();
        int[] arr = new int[100000];
        for(int i = 0;i<100000;i++){
            arr[i]=i;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
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

