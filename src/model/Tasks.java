package model;

public class Tasks {
    public void t211(int[] arr) {
        double posSum = 0;
        int countOfPos = 0;
        for (int i : arr) {
            if (i >= 0) {
                posSum += i;
                countOfPos++;
            }
        }
        double posArithmeticMean = posSum / countOfPos;
        System.out.println(posArithmeticMean);
    }

    public void t212(int[] arr) {
        double posProd = 1;
        int countOfPos = 0;
        for (int i : arr) {
            if (i >= 0) {
                posProd *= i;
                countOfPos++;
            }
        }
        double posGeometricMean = posProd / countOfPos;
        System.out.println(posGeometricMean);
    }

    public void t213(int[] arr) {
        double negProd = 1;
        int countOfNeg = 0;
        for (int i : arr) {
            if (i < 0) {
                negProd *= i;
                countOfNeg++;
            }
        }
        double negGeometricMean = negProd / countOfNeg;
        System.out.println(negGeometricMean);
    }

    public void t214(int[] arr) {
        double negSum = 0;
        int countOfNeg = 0;
        for (int i : arr) {
            if (i < 0) {
                negSum += i;
                countOfNeg++;
            }
        }
        double negArithmeticMean = negSum / countOfNeg;
        System.out.println(negArithmeticMean);
    }

    public void t215(int[] arr) {
        int evenIndexSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenIndexSum += arr[i];
            }
        }
        System.out.println(evenIndexSum);
    }

    public void t216(int[] arr) {
        int evenIndexProd = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenIndexProd *= arr[i];
            }
        }
        System.out.println(evenIndexProd);
    }

    public void t217(int[] arr) {
        int oddIndexSquareProd = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                oddIndexSquareProd *= (arr[i] * arr[i]);
            }
        }
        System.out.println(oddIndexSquareProd);
    }

    public void t218(int[] arr) {
        int oddIndexAbsSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                if (arr[i] < 0) {
                    oddIndexAbsSum += -arr[i];
                } else {
                    oddIndexAbsSum += arr[i];
                }
            }
        }
        System.out.println(oddIndexAbsSum);
    }

    public void t219(int[] arr, int k) {
        int kMultipleIndexCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % k == 0) {
                kMultipleIndexCount++;
            }
        }
        System.out.println(kMultipleIndexCount);
    }

    public void t220(int[] arr) {
        int posC = 0, negC = 0;
        for (int i : arr) {
            if (i >= 0) {
                posC++;
            } else {
                negC++;
            }
        }
        System.out.println("positive count: " + posC + "\nnegative count: " + negC);
    }

    public void t221(int[] arr, int a, int b) {
        int sum = 0;
        for (int i : arr) {
            if (i >= a && i <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public void t222(int[] arr, int c, int d) {
        int prod = 1;
        for (int i : arr) {
            if (i >= c && i < d) {
                prod *= i;
            }
        }
        System.out.println(prod);
    }

    public void t223(int[] arr, int a, int b) {
        int count = 0;
        for (int i : arr) {
            if (i > a && i < b) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void t224(int[] arr, int k) {
        int sum = 0;
        for (int i : arr) {
            int abs;
            if (i < 0) {
                abs = -i;
            } else {
                abs = i;
            }
            if (abs < k) {
                sum += abs * abs * abs;
            }
        }
        System.out.println(sum);
    }

    public void t225(int[] arr, int t) {
        int prod = 1;
        for (int i : arr) {
            int abs;
            if (i < 0) {
                abs = -i;
            } else {
                abs = i;
            }
            if (abs < t) {
                prod *= i;
            }
        }
        System.out.println(prod);
    }

    public void t226(int[] arr, int k) {
        int count = 0;
        for (int i : arr) {
            int abs;
            if (i < 0) {
                abs = -i;
            } else {
                abs = i;
            }
            if (abs < k) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void t227(int[] arr, int k) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % k == 0) {
                sum += arr[i];
                count++;
            }
        }
        System.out.println(sum / count);
    }

    public void t228(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % k == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public void t229(int[] arr, int k) {
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - i >= 0) {
                prod *= arr[i];
            }
        }
        System.out.println(prod);
    }

    public void t230(int[] arr, int k) {
        double prod = 1;
        int count = 1;
        for (int i : arr) {
            if (i % k == 0) {
                prod *= i;
                count++;
            }
        }
        System.out.println(prod / count);
    }
}