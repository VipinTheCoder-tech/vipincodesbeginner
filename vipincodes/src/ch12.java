public class ch12 {
    public static void main(String[] args) {
       //float a =7/4f *9/2f;
        //output will be 7.875 which is same as mathematics 
        //if we do without f ans will be only 4.0 
        //System.out.println(a );
        
        //problem 2 : we can forcefully print another data typein another type 
        char grade = 'a';
        grade = (char)(grade +16);//encrypted in char a 
        System.out.println(grade );
       // if you  wants to decrypt it 
       grade = (char)(grade - 16);
        System.out.println(grade);

    } 
}
