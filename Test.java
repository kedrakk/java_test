class Simple{
    static int checkValue(int[] arr){
        if(arr==null||arr.length==0||arr.length%2==0){
            return 0;
        }
        else{
            int middleIndex=(arr.length/2)+1;
            int middleValue=arr[middleIndex];
            for (int i=0;i<arr.length;i++){
                if(i!=middleIndex&&arr[i]<middleValue){
                    return 0;
                }
            }
            return 1;
        }
    }

    static int sumOfArray(int[] arr){
        int evenSum=0;
        int oddSum=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0) oddSum+=arr[i];
            else evenSum+=arr[i];
        }
        return oddSum-evenSum;
    }

    static char[] newSubArray(char[] arr,int startIndex,int length){
        if(arr!=null&&arr.length>0&&arr.length>startIndex&&arr.length>=(startIndex+length)){
            char[] newArr=new char[length];
            System.arraycopy(arr,startIndex,newArr,0,length);
            return newArr;
        }else{
            return null;
        }
    }

    static int reverseInt(int input){
        boolean isMinusVal=input<0;
        String inputString=String.valueOf(input);
        if(inputString.length()>0){
            if(inputString.length()==1){
                inputString
            }
        }else{
            return 0;
        }
    }

    static int is121Array(int[] arr){
        if(arr!=null&&arr.length>2){
            int j=arr.length-1;
            int middleIndex=arr.length/2;
            int oneCount=0;
            int twoCount=0;
            for (int i=0;i<middleIndex;i++){
                //check other values
                if(arr[i]!=1&&arr[i]!=2){
                    return 0;
                }

                //check last and start
                if(arr[i]!=arr[j]){
                    return 0;
                }else{
                    if(arr.length>3&&i==middleIndex-1&&j==middleIndex+1){
                        if(arr[i]!=arr[middleIndex]){
                            return 0;
                        }
                    }
                    j--;
                }

                //count increment
                if(arr[i]==1) oneCount++;
                if(arr[i]==2) twoCount++;
            }
            if(oneCount>0&&twoCount>0){
                return 1;
            }
            return 0;
        }
        return 0;
    }

    static int isSelfReferential(int[] arr){
        if(arr!=null&&arr.length>0){
            int currentIndex=0;
            for (int i=0;i<arr.length;i++){
                currentIndex=i;
                int currentIndexCount=0;
                for (int j=0;j<arr.length;j++){
                    if(arr[j]==currentIndex){
                        currentIndexCount++;
                    }
                }
                if(arr[currentIndex]!=currentIndexCount){
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }

    static int isOlympic (int[ ] arr){
        if(arr!=null&&arr.length>0){
            int currentValue;
            for (int i=0;i<arr.length;i++){
                if (arr[i]<0) return 0;
                currentValue=arr[i];
                int currentValueSum=0;
                for (int j=0;j<arr.length;j++){
                    if(arr[j]<currentValue){
                        currentValueSum+=arr[j];
                    }
                }
                if(currentValueSum>currentValue) return 0;
            }
            return 1;
        }
        return 0;
    }

    static void main(String[] args){
        int[] array=[1];
        int result=checkValue(array);
        System.out.println(result);
    }
}