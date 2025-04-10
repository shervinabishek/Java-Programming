class Paper{
	int length;
	int width;
	String text;
}

class Document{
	String name;
	Paper p;
	public static void main(String[] args){
		Document d=new Document();
		System.out.println("Create a Document Object d");
		d.name="My first Document";
		System.out.println("Name of Document Object d is " +d.name);
		
		d.p=new Paper();
		d.p.text="This is the text";
		d.p.length=52;
		d.p.width=25;
		System.out.println("size (l*w) of the paper of the document is " +d.p.length+" * "+d.p.width);
		System.out.println("Text is "+d.p.text);
		
		Document d2=new Document();
		d2.name="My Second Document";
		System.out.println("Name of Document Object d2 is " +d2.name);
		
	}
}