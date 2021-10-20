
public class Tester {
	public static void main(String[] args){
		MAC286Tree T = new MAC286Tree();
		T.insert(11,  -1);
		T.insert(8,  -3);
		T.insert(13,  -7);
		T.insert(6,  -20);
		T.insert(9,  -10);
		T.insert(12,  -5);
		T.insert(15,  -7);
		T.InOrder();
		/*System.out.println("---Pre---");
		T.PreOrder();
		System.out.println("---Post---");
		T.PostOrder();*/
		System.out.println("---Post---");
		T.Delete(13);
		T.InOrder();
		System.out.println("---Post---");
		T.Delete(11);
		T.InOrder();
		System.out.println("---Post---");
		T.Delete(6);
		T.InOrder();
	}
}