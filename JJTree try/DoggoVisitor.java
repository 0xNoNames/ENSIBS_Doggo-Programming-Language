/* Generated By:JavaCC: Do not edit this line. DoggoVisitor.java Version 4.1d1 */
public interface DoggoVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTStart node, Object data);
  public Object visit(ASTDeclaration node, Object data);
  public Object visit(ASTAffectation node, Object data);
  public Object visit(ASTEtExpr node, Object data);
  public Object visit(ASTOuExpr node, Object data);
  public Object visit(ASTNonExpr node, Object data);
  public Object visit(ASTEgalExpr node, Object data);
  public Object visit(ASTInegalExpr node, Object data);
  public Object visit(ASTSupExpr node, Object data);
  public Object visit(ASTSupEgalExpr node, Object data);
  public Object visit(ASTInfExpr node, Object data);
  public Object visit(ASTInfEgalExpr node, Object data);
  public Object visit(ASTAddExpr node, Object data);
  public Object visit(ASTSousExpr node, Object data);
  public Object visit(ASTMulExpr node, Object data);
  public Object visit(ASTDivExpr node, Object data);
  public Object visit(ASTPuisExpr node, Object data);
  public Object visit(ASTNegExpr node, Object data);
  public Object visit(ASTIdentifiant node, Object data);
  public Object visit(ASTEntier node, Object data);
  public Object visit(ASTFlotant node, Object data);
  public Object visit(ASTChaine node, Object data);
  public Object visit(ASTBooleen node, Object data);
}
/* JavaCC - OriginalChecksum=a8d68208a48e64602786ad960173c009 (do not edit this line) */