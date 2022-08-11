package Iterator;


// �������� ������ ��� ContentControl
public class ContentControlIterator extends CompositeControlIterator {

	public ContentControlIterator(CompositeControl source) {
		super(source);
	}
	protected void fillComposites(CompositeControl parent) {
		//composites.push(parent);
		for(UIComponent c : parent.getChildren())
			if (c instanceof CompositeControl)
				fillComposites((CompositeControl)c);
			else if (c instanceof ContentControl)
				composites.push(c);
				
	}
	
	// �������������� ��� �������������� ���� � ContentControl
	@Override
	public ContentControl getNext() {
		return (ContentControl)super.getNext();
	}

}
