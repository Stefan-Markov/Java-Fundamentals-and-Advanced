import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    private static boolean isInRange(int[] array, int index) {
        boolean inRange = false;
        if (index >= 0 && index < array.length) {
            inRange = true;
        }
        return inRange;
    }

    private static void rotateArr(int[] array, int index) {
        int[] leftArray = new int[index + 1];
        int[] rightArray = new int[array.length - leftArray.length];
        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[i];
        }
        int newIndex = 0;
        for (int i = index + 1; i < array.length; i++) {
            rightArray[newIndex] = array[i];
            newIndex++;
        }
        for (int i = 0; i < rightArray.length; i++) {
            array[i] = rightArray[i];
        }
        for (int i = rightArray.length; i < array.length; i++) {
            array[i] = leftArray[i - rightArray.length];
        }
    }

    private static int maxEven(int[] array) {
        int index = -1;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] >= maxValue) {
                maxValue = array[i];
                index = i;
            }
        }
        return index;
    }

    private static int maxOdd(int[] array) {
        int index = -1;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] >= maxValue) {
                maxValue = array[i];
                index = i;
            }
        }
        return index;
    }

    private static int minEven(int[] array) {
        int index = -1;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] <= minValue) {
                minValue = array[i];
                index = i;
            }
        }
        return index;
    }

    private static int minOdd(int[] arr) {
        int index = -1;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] <= minValue) {
                minValue = arr[i];
                index = i;
            }
        }
        return index;
    }

    private static int[] firstEven(int[] array, int counter) {
        int[] result = new int[counter];

        Arrays.fill(result, -1);
        int index = 0;
        for (int num : array) {
            if (num % 2 == 0 && index < result.length) {
                result[index] = num;
                index++;
            }
        }
        return result;
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                continue;
            }
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else if (array[i + 1] != -1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
    }

    private static int[] firstOdd(int[] array, int count) {
        int[] result = new int[count];

        Arrays.fill(result, -1);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num % 2 != 0 && index < result.length) {
                result[index] = num;
                index++;
            }
        }
        return result;
    }

    private static int[] lastEven(int[] array, int count) {
        int[] result = new int[count];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = -1;
        }
        int index = result.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0 && index < result.length && index >= 0) {
                result[index] = array[i];
                index--;
            }
        }
        return result;
    }

    private static int[] lastOdd(int[] array, int count) {
        int[] result = new int[count];

        Arrays.fill(result, -1);
        int index = result.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 != 0 && index < result.length && index >= 0) {
                result[index] = array[i];
                index--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputText = scanner.nextLine().split("\\s+");
        int[] array = new int[inputText.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(inputText[i]);
        }

        String inputCommand = scanner.nextLine();
        while (!"end".equals(inputCommand)) {
            String[] tokens = inputCommand.split("\\s+");
            String type = tokens[0];

            if ("exchange".equals(type)) {
                int index = Integer.parseInt(tokens[1]);
                if (isInRange(array, index)) {
                    rotateArr(array, index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if ("max".equals(type)) {
                int index;
                if ("even".equals(tokens[1])) {
                    index = maxEven(array);
                } else {
                    index = maxOdd(array);
                }
                if (index != -1) {
                    System.out.println(index);
                } else {
                    System.out.println("No matches");
                }

            } else if ("min".equals(type)) {
                int index;
                if ("even".equals(tokens[1])) {
                    index = minEven(array);
                } else {
                    index = minOdd(array);
                }
                if (index != -1) {
                    System.out.println(index);
                } else {
                    System.out.println("No matches");
                }

            } else if ("first".equals(type)) {
                int count = Integer.parseInt(tokens[1]);
                if (count > array.length) {
                    System.out.println("Invalid count");
                } else {
                    if ("even".equals(tokens[2])) {
                        int[] result = firstEven(array, count);
                        printArray(result);
                    } else {
                        int[] result = firstOdd(array, count);
                        printArray(result);
                    }
                }
            } else if ("last".equals(type)) {
                int count = Integer.parseInt(tokens[1]);
                if (count > array.length) {
                    System.out.println("Invalid count");
                } else {
                    if ("even".equals(tokens[2])) {
                        int[] result = lastEven(array, count);
                        printArray(result);
                    } else {
                        int[] result = lastOdd(array, count);
                        printArray(result);
                    }
                }
            }
            inputCommand = scanner.nextLine();
        }
        printArray(array);
    }
}
