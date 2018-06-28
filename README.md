# Head-first-java-examples
Head first java song example

Hy guys, im really Newbie in JAVA programming, im trying to reproduce the head first java example in the page 72 chapter 4.

     class: song

     instances: artist, title.

     methods: setTitle()

     setArtist()

     play()

the confusion become when appear this method in the book explanation:

     void play() {

     soundPlayer.playSound(title);

     }

the object "soundPlayer" cant be inside the class song, this method will give a "class song" compilation error!!

//Should not the above method be like this?//

     public String play(){

     return title;

     }

this is my complete code:

     public class song{

     String title;

     String artist;

     public void settitle(String title){

     this.title = title; 

     }

there is a another way according with the page and chapter of this book to store title in the above method?

     public void setartist(String artist){

     this.artist = artist; 

     }

there is another way to store artist?

     public String play(){

     return title;

     }

     }

is not to early (page 72 chapter 4 ) for this book to use key word "this"?;

//Thanks for your answers.//



