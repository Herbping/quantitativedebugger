package sketchobj.core;

import java.util.List;

import constraintfactory.ConstData;

public class FcnHeader extends SketchObject {
    String name; // or null
	Type returnType;
    List<Parameter> params;
    public FcnHeader(String name , Type returnType, List<Parameter> params){
    	this.name = name;
    	this.returnType = returnType;
    	this.params = params;
    }
    public FcnHeader(String name , Type returnType, ParametersList params){
    	this.name = name;
    	this.returnType = returnType;
    	this.params = params.getList();
    }
    
    public void setName(String name){
    	this.name = name;
    }
    
    public void setReturnType(Type t){
    	this.returnType = t;
    }
    public String getName(){
    	return this.name;
    }
    public Type getReturnType(){
    	return this.returnType;
    }
    public String toString(){
    	String result = "";
    	result += name;
    	result = returnType.toString()+" "+result;
    	result = result + "(";
    	for(Parameter p: params){
    		result = result + p.toString();
    	}
    	result = result + ")";
    	return result;
    }
    
    public List<Parameter> getPara(){
    	return this.params;
    }
	@Override
	public ConstData replaceLinearCombination(int index) {
		// TODO Auto-generated method stub
		return null;
	}
}
