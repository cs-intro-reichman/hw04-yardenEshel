public class ArrayOps {
    public static void main(String[] args) {
        
        
        
    }
    
    public static int findMissingInt (int [] array) {
        
        int fullSum = (array.length*(array.length+1))/2;
        int partialSum = 0;
        for(int i =0; i< array.length;i++)
        {
            partialSum += array[i];
        }

        return fullSum - partialSum;
    }

    public static int secondMaxValue(int [] array) {
        int biggest = 0;
        int secondBiggest = 0;
        for(int i =0;i< array.length;i++)
        {
            if(array[i]>=biggest)
            {
                secondBiggest = biggest;
                biggest = array[i];
            }
            else if(array[i] > secondBiggest)
            {
                secondBiggest = array[i];
            }
        }
        return secondBiggest;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int oneLength = array1.length;
        int twoLength = array2.length;
        int currentNum = 0;
        boolean flag = false;
        for(int i =0;i< oneLength;i++)
        {
            flag = false;
            currentNum = array1[i];
            for(int j =0;j<twoLength;j++)
            {
                if(currentNum == array2[j])
                {
                    flag = true;
                }
            }
            if (!flag) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        int isIncrease = 0;
        int preElement = array[0];
        for(int i =0;i< array.length;i++)
        {
            
            if(preElement - array[i]>0)
            {
                if(isIncrease == -1)
                {
                    return false;
                }
                else if(isIncrease == 0)
                {
                    isIncrease = 1;
                }

                    
            }
            else if(preElement - array[i]<0)
            {
                if(isIncrease == 1)
                {
                    return false;
                }
                else if(isIncrease == 0)
                {
                    isIncrease = -1;
                }
            }
            preElement = array[i];

        }
        return true;
    }

}
