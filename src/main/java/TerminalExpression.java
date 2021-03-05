// TerminalExpression class implementing 
// the above interface. This interpreter  
// just check if the data is same as the  
// interpreter data. 
class TerminalExpression implements Expression {
    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String con) {
        if(con.contains(data)) {
            return true;
        }
        else {
            return false;
        }
    }
}
