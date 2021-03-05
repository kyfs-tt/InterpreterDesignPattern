// AndExpression class (non-terminal) implementing
// the above interface. This interpreter  
// just returns the And condition of the  
// data is same as the interpreter data. 
class AndExpression implements Expression {
    Expression expr1;
    Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String con) {
        return expr1.interpret(con) && expr2.interpret(con);
    }
}
