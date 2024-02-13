/**
 * The Calculator class in Java performs basic arithmetic operations such as addition, subtraction,
 * multiplication, and division.
 */
class Calci{
    float addition(float operand_1,float operand_2){
        return(operand_1+operand_2);
}
float substraction(float operand_1,float operand_2){
    return(operand_1-operand_2);
}
float multiplication(float operand_1,float operand_2){
    return(operand_1*operand_2);
}
float division(float operand_1,float operand_2){
    return(operand_1/operand_2);
}

public static void main(String[]args){
    Calculator calc=new Calculator();
    float operand_1=10;
    float operand_2=10;
    float add_result=calc.addition(operand_1,operand_2);
    System.out.println("result:"+add_result);
    float sub_result=calc.substraction(operand_1,operand_2);
    System.out.println("result:"+sub_result);
    float mult_result=calc.multiplication(operand_1,operand_2);
    System.out.println("result:"+mult_result);
    float div_result=calc.division(operand_1,operand_2);
    System.out.println("result:"+div_result);
   


}
    
}
