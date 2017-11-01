public class ProjectTest{
    public static void main(String[] args){
        Project proj = new Project();
        proj.elevatorPitch();

        proj.setName("Devi");
        proj.elevatorPitch();
        Project proj1 = new Project("Filmon");
        String name = proj1.getName();
        System.out.println("this is new name: " + name);

        Project proj3 = new Project("Kal","Project Universe");
        String name2 = proj3.getNameAndDesc();
        System.out.println("name and description: " + name2 );

        proj.setName("Sol");
        proj.setDesc("project x");
        proj.setNameDesc("Bob", "Circus project");
        String name3 = proj.getName();
        String desc = proj.getDesc();
        String nameDesc = proj.getNameAndDesc();
        System.out.println("name: " + name3 + "\ndescription: " + desc);
        System.out.println("name and description: " + nameDesc);
        

    }
}