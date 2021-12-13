import java.util.HashMap;
import java.util.LinkedList;

public class DoggoVisitor implements DoggoParserVisitor{
	
	private LinkedList stack=new LinkedList();
	private HashMap symbolTable=new HashMap();

	public Object visit(SimpleNode node, Object data) {
		node.childrenAccept(this,data);
		return null;
	}

	public Object visit(ASTStart node, Object data) {
		node.childrenAccept(this,data);
		return symbolTable;
	}

	public Object visit(ASTAddExpr node, Object data) {
		node.childrenAccept(this,data);
		Integer arg1 = pop();
		Integer arg2 = pop();
		stack.addFirst(new Integer(arg2.intValue()+arg1.intValue()));
		return null;
	}

	public Object visit(ASTSousExpr node, Object data) {
		node.childrenAccept(this,data);
		Integer arg1 = pop();
		Integer arg2 = pop();
		stack.addFirst(new Integer(arg2.intValue()-arg1.intValue()));
		return null;
	}

	public Object visit(ASTMulExpr node, Object data) {
		node.childrenAccept(this,data);
		Integer arg1 = pop();
		Integer arg2 = pop();
		stack.addFirst(new Integer(arg2.intValue()*arg1.intValue()));
		return null;
	}

	public Object visit(ASTDivExpr node, Object data) {
		node.childrenAccept(this,data);
		Integer arg1 = pop();
		Integer arg2 = pop();
		stack.addFirst(new Integer(arg2.intValue()/arg1.intValue()));
		return null;
	}

	public Object visit(ASTNegExpr node, Object data) {
		node.childrenAccept(this,data);
		Integer arg1 = pop();
		stack.addFirst(new Integer(arg1.intValue()*-1));
		return null;
	}

	public Object visit(ASTEntier node, Object data) {
		node.childrenAccept(this,data);
		stack.addFirst(node.data.get("value"));
		return null;
	}

	public Object visit(ASTFlotant node, Object data) {
		node.childrenAccept(this,data);
		stack.addFirst(node.data.get("value"));
		return null;
	}

	public Object visit(ASTChaine node, Object data) {
		node.childrenAccept(this,data);
		stack.addFirst(node.data.get("value"));
		return null;
	}

	public Object visit(ASTBooleen node, Object data) {
		node.childrenAccept(this,data);
		stack.addFirst(node.data.get("value"));
		return null;
	}

	public Object visit(ASTDeclaration node, Object data) {
		node.childrenAccept(this,data);
		Integer value=(Integer)stack.removeFirst();
		String var=(String)stack.removeFirst();
		symbolTable.put(var,value);
		return null;
	}

	public Object visit(ASTAffectation node, Object data) {
		node.childrenAccept(this,data);
		Integer value=(Integer)stack.removeFirst();
		String var=(String)stack.removeFirst();
		symbolTable.put(var,value);
		return null;
	}

	public Object visit(ASTIdentifiant node, Object data) {
		node.childrenAccept(this,data);
		String var=(String)node.data.get("name");
		stack.addFirst(var);
		return null;
	}
	
	private Integer pop()
	{
		return (Integer)stack.removeFirst();
	}
}
