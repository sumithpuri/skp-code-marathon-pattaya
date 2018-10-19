package me.sumithpuri.github.pattaya.state;

/*
 * @author Sumith Puri
 */
public interface State {

	public void purchase();
	public void authorise();
	public void assemble();
	public void dispatch();
	public void complete();
}
