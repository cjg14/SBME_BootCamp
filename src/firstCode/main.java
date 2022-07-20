package firstCode;

class main { //needs to exactly match the file
    public static void main (String[] args) {
        int[] foo = {0,1,2,3,4};

        int[] hello = new int[100]; //Changed "bar" to "hello"
        for(int i = 0; i < 100; i++) {
            hello[i] = i;
        }

        System.out.println("The number of even numbers in foo is:");
        System.out.println(countEvenNum(foo,5));

        System.out.println("The number of even numbers in hello is:");
        System.out.println(countEvenNum(hello,100));
    }

    private static int countEvenNum(int[] arr, int size){
        int count = 0;

        for(int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

