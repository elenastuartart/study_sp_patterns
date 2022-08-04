package com.stuart.Decorator;


import com.stuart.Decorator.widgets.CompositeControl;

public abstract class CompositeBaseDecorator extends CompositeControl {
	protected CompositeControl wrappee;
	
	public CompositeBaseDecorator(CompositeControl wrappee) {
		this.wrappee = wrappee;
		this.children = this.wrappee.getChildren();
	}

}
