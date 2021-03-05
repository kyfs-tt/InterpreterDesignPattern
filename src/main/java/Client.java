// Driver class 
class Client {

    public static void main(String[] args) {
        // Create the AST

        // Create OR expression
        // Assume code is: banku || fufu
        Expression meal1 = new TerminalExpression("banku");
        Expression meal2 = new TerminalExpression("fufu");
        Expression anyMeal = new OrExpression(meal1, meal2);

        // Create AND expression
        // Assume code is: blue && red
        Expression color1 = new TerminalExpression("blue");
        Expression color2 = new TerminalExpression("red");
        Expression colorCombo = new AndExpression(color1, color2);


        // Use interpreter pattern

        String context = "fufu, pizza";
        System.out.println("Context: " + context + "; Interpreter output: " + anyMeal.interpret(context));
        context = "koko, pizza";
        System.out.println("Context: " + context + "; Interpreter output: " + anyMeal.interpret(context));
        context = "banku, fufu";
        System.out.println("Context: " + context + "; Interpreter output: " + anyMeal.interpret(context));

        context = "blue, gold";
        System.out.println("Context: " + context + "; Interpreter output: " + colorCombo.interpret(context));
        context = "blue, red";
        System.out.println("Context: " + context + "; Interpreter output: " + colorCombo.interpret(context));
    }
}
