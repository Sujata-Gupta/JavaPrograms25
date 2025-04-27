package tasks.tasks;

public class task2103_Vowels {
    public static void main(String[] args) {
        //Count vowels(a,e,i,o,u) and consonants in a String. → pramod, → vowels - 2, consonants - 4
        String alpha="pramod";
        int vowels=0;
        int consonants=0;

        for (int i=0;i<alpha.length();i++)
        {
            char ch=alpha.charAt(i);
            if(ch>='a' && ch<='z')
            {
                if( ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u')
                {
                    vowels++;
                }
                else
                {
                    consonants++;
                }

            }

        }
        System.out.println("vowels " + vowels);
        System.out.println("consonants "+ consonants);







    }
}
