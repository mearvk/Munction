package theoretical;

public class MunctionListControlExtender<Type>
{
    public MunctionListControlLogic logic = new MunctionListControlLogic(this, "", "", "");

    //

    public MunctionListClassTypeExtender cbe = new MunctionListClassTypeExtender<Type>();

    public MunctionListNewTypeExtender nte = new MunctionListNewTypeExtender<Type>();

    public MunctionListInsertionEventExtender iee = new MunctionListInsertionEventExtender<Type>();
}
