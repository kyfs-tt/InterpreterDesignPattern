// OrExpression class (non-terminal) implementing
// the above interface. This interpreter  
// just returns the or condition of the  
// data is same as the interpreter data. 
class OrExpression implements Expression {
    Expression expr1;
    Expression expr2;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String con) {
        return expr1.interpret(con) || expr2.interpret(con);
    }
}
