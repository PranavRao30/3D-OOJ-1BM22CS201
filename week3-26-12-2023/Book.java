import java.util.Scanner;
class Book
	{
	String name,author;
	int price;
	int num_pages;

	Book(String name,String author,int price,int num_pages){
		this.name=name;
		this.author=author;
		this.price=price;
		this.num_pages=num_pages;
	}

	public String toString(){
		String n,a,p,N;
		n="\n"+"Name of Book: "+name+"\n";
		a="Author of Book: "+author+"\n";
		p="Price of Book: "+price+"\n";
		N="Number of pages: "+num_pages+"\n";
		return n+a+p+N;
	}
	
}

class Main
	{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter number of books: ");
		int n=sc.nextInt();
		Book b[]=new Book[n];
		String name,author;
		int price,num;
    		sc.nextLine();
		for(int i=0;i<n;i++){
			System.out.println("Enter name of book: ");
			name=sc.nextLine();
			System.out.println("Enter author's name: ");
			author=sc.nextLine();
			System.out.println("Enter price: ");
			price=sc.nextInt();
			System.out.println("Enter number of pages: ");
			num=sc.nextInt();
			b[i]= new Book(name,author,price,num);
		}
		System.out.println("Book Details: ");
		for(int i=0;i<n;i++){
			System.out.println(b[i].toString());
		}
	}			
}
