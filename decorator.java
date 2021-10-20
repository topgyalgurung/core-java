
public interface ChirstmasTree{
    String decorate();
}
public class ChristmasTreeImpl implements ChirstmasTree{
    @Override
    public String decorate(){
        return "Christmas Tree";
    }
}
public abstract class TreeDecorator implements ChirstmasTree{
    private ChristmasTree tree;

    @Override
    public String decorate(){
        return tree.decorate();
    }
}
public class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }
    
    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }
    
    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}
public class Garland extends TreeDecorator{
    public Garland(ChristmasTree tree) {
        super(tree);
    }
    
    public String decorate() {
        return super.decorate() + decorateWithGarland();
    } 
    private String decorateWithGarland() {
        return " with Garland";
    }
}
}

public class decorator {
    @Test
public void whenDecoratorsInjectedAtRuntime_thenConfigSuccess() {
    ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
    assertEquals(tree1.decorate(), 
      "Christmas tree with Garland");
     
    ChristmasTree tree2 = new BubbleLights(
      new Garland(new Garland(new ChristmasTreeImpl())));
    assertEquals(tree2.decorate(), 
      "Christmas tree with Garland with Garland with Bubble Lights");
}
    
}
