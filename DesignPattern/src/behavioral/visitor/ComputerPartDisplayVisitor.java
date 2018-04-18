package behavioral.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Mouse mouse) {
		System.out.println("displaying mouse");

	}

	@Override
	public void visit(KeyBoard keyboard) {
		System.out.println("displaying keyboard");

	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("displaying monitor");

	}

	@Override
	public void visit(Computer computer) {
		System.out.println("displaying computer");

	}

}
