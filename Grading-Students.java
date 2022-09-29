class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
            List<Integer> result=new ArrayList<Integer>();
            int f,z,y;
            for(int i: grades){
            if(i<38){
                result.add(i);
            }
            else{
                f=i%5;
                z=5-f;
                if(z>0 && z<3){
                    result.add(i+z);
                }
                else if(z<0 && z>-3){
                    y=10-z;
                    result.add(i+y);
                }
                else result.add(i);
            }
            }
            return result;
    }

}
