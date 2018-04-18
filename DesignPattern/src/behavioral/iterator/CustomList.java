package behavioral.iterator;

public class CustomList implements Container {

	public String[] nameList = { "java", "j2ee", "jsp", "struts" };

	@Override
	public Iterator iterator() {

		return new CustomListDemo();
	}

	private class CustomListDemo implements Iterator {
		int index;

		@Override
		public boolean hasNext() {
			if (index < nameList.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (hasNext()) {
				return nameList[index++];
			}
			return null;
		}

	}

}
