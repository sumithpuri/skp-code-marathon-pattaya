package me.sumithpuri.github.pattaya.state;

/**
 * MIT License
 *
 * Copyright (c) 2018-19,	Sumith Kumar Puri

 * GitHub URL 			https://github.com/sumithpuri
 * Blog Post URL		http://www.techilashots.com/2008/12/design-patterns-series-ii.html
 * Blog Short URL		https://goo.gl/XCc2gx
 * Package Prefix 		me.sumithpuri.github.pattaya
 * Project Codename		pattaya
 * Contact E-Mail		code@sumithpuri.me
 * Contact WhatsApp		+91 9591497974
 *
 *
 * Permission is hereby  granted,  free  of  charge, to  any person  obtaining a  copy of  this  software and associated 
 * documentation files (the "Software"), to deal in the  Software without  restriction, including without limitation the 
 * rights to use, copy, modify, merge, publish, distribute, sub-license and/or sell copies of the Software and to permit 
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in  all copies or substantial portions of the 
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS  OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES  OR  OTHER  LIABILITY, WHETHER IN AN ACTION  OF  CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public class PerItemWorkflow {

	State currentState;
	
	SelectionState selectionState;
	PurchaseState purchaseState;
	AuthoriseState authoriseState;
	AssembleState assembleState;
	DispatchState dispatchState;
	
	public PerItemWorkflow() {
		selectionState = new SelectionState(this);
		purchaseState = new PurchaseState(this);
		authoriseState = new AuthoriseState(this);
		assembleState = new AssembleState(this);
		dispatchState = new DispatchState(this);
		
		currentState = selectionState;
	}

	/**
	 * @return the currentState
	 */
	public synchronized State getCurrentState() {
		return currentState;
	}

	/**
	 * @param currentState the currentState to set
	 */
	public synchronized void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	/**
	 * @return the selectionState
	 */
	public synchronized SelectionState getSelectionState() {
		return selectionState;
	}

	/**
	 * @param selectionState the selectionState to set
	 */
	public synchronized void setSelectionState(SelectionState selectionState) {
		this.selectionState = selectionState;
	}

	/**
	 * @return the purchaseState
	 */
	public synchronized PurchaseState getPurchaseState() {
		return purchaseState;
	}

	/**
	 * @param purchaseState the purchaseState to set
	 */
	public synchronized void setPurchaseState(PurchaseState purchaseState) {
		this.purchaseState = purchaseState;
	}

	/**
	 * @return the authoriseState
	 */
	public synchronized AuthoriseState getAuthoriseState() {
		return authoriseState;
	}

	/**
	 * @param authoriseState the authoriseState to set
	 */
	public synchronized void setAuthoriseState(AuthoriseState authoriseState) {
		this.authoriseState = authoriseState;
	}

	/**
	 * @return the assembleState
	 */
	public synchronized AssembleState getAssembleState() {
		return assembleState;
	}

	/**
	 * @param assembleState the assembleState to set
	 */
	public synchronized void setAssembleState(AssembleState assembleState) {
		this.assembleState = assembleState;
	}

	/**
	 * @return the dispatchState
	 */
	public synchronized DispatchState getDispatchState() {
		return dispatchState;
	}

	/**
	 * @param dispatchState the dispatchState to set
	 */
	public synchronized void setDispatchState(DispatchState dispatchState) {
		this.dispatchState = dispatchState;
	}
	
	public void purchase(String itemName) {
		System.out.print(itemName);
		currentState.purchase(); 
	}
	
	public void authorise() {
		currentState.authorise();
	}
	
	public void assemble() {
		currentState.assemble();
	}
	
	public void dispatch() {
		currentState.dispatch();
	}
	
	public void complete() {
		currentState.complete();
	}
}
