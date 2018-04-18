package behavioral.visitor;

public class Computer implements ComputerPart {

	ComputerPart[] computerParts = { new Mouse(), new KeyBoard(), new Monitor() };

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (int i = 0; i < computerParts.length; i++) {
			computerParts[i].accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);

	}

}
