package Browser;

public class Browser {
public void internet(){
    showPage();
    addNewPage();
    updatePage();
    deletePage();
}
    private void showPage(){
        System.out.println("Showing Page");
    }
    private void addNewPage(){
        System.out.println("Adding New Page");
    }
    private void updatePage(){
        System.out.println("Updating Page");
    }
    private void deletePage(){
        System.out.println("Deleting Page");
    }
}
