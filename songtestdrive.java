public class songtestdrive{
public static void main(String[] args){
song t2 = new song();

t2.setartist("travis");
t2.settitle("sing");

song s3 = new song();

s3.setartist("sex pistols");
s3.settitle("my way");

System.out.println(t2.play());
System.out.println(s3.play());

}

}
