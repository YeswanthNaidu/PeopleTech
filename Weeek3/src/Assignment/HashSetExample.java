/*
 * package Assignment;
 * 
 * import java.util.HashSet; import java.util.NavigableMap; import
 * java.util.Objects; import java.util.TreeSet;
 * 
 * public class HashSetExample {
 * 
 * public static void main(String[] args) {
 * 
 * 
 * 
 * 
 * HashSet<Book> set=new HashSet<Book>(); Book b1=new
 * Book(101,"Let US C","Yeswanth","BPB",8); Book b2=new
 * Book(102,"Data Communication","Naidu","MCS",6); Book b3=new
 * Book(103,"Operatioin","Chandu","Wiley",5); Book b4=new
 * Book(101,"Let US C","Yeswanth","BPB",8); Book b5=new
 * Book(102,"Data Communication","Naidu","MCS",6); Book b6=new
 * Book(103,"Operatioin","Chandu","Wiley",5); set.add(b1); set.add(b2);
 * set.add(b3); set.add(b4); set.add(b5); set.add(b6); for(Book b:set) {
 * System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quality
 * ); }
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * class Book { int id; String name,author,publisher; int quality; public
 * Book(int id, String name, String author, String publisher, int quality) {
 * super(); this.id = id; this.name = name; this.author = author; this.publisher
 * = publisher; this.quality = quality;
 * 
 * }
 * 
 * @Override
 * 
 * 
 * 
 * public String toString() { return "Book [id=" + id + ", name=" + name +
 * ", author=" + author + ", publisher=" + publisher + ", quality=" + quality +
 * "]";
 * 
 * }
 * 
 * @Override public int hashCode() { return Objects.hash(author, id, name,
 * publisher, quality); }
 * 
 * @Override public boolean equals(Object obj) { if (this == obj) return true;
 * if (obj == null) return false; if (getClass() != obj.getClass()) return
 * false; Book other = (Book) obj; return Objects.equals(author, other.author)
 * && id == other.id && Objects.equals(name, other.name) &&
 * Objects.equals(publisher, other.publisher) && quality == other.quality; }
 * public String getName() { // TODO Auto-generated method stub return null; }
 * 
 * 
 * }
 */