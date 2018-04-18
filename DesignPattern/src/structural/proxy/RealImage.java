package structural.proxy;

public class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadImage();
	}

	@Override
	public void display() {

		System.out.println("file name " + fileName);
	}

	private void loadImage() {
		System.out.println("loading file " + fileName);
	}

}
