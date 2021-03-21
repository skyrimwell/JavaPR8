package Visitor;

public class Track extends Auto {
    public Track(String modelTitle) {
        super(modelTitle);
    }
    @Override
    public void Accept(Visitor visitor) {
        visitor.visit(this);
    }
}