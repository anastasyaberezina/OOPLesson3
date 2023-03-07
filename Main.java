package Per;

public class Main {
    public static void main(String[] args) {   //Oбъекты класса Person
        var aleksandr = new Person("Александр", 70);
        var maria = new Person("Мария", 60);
        var aleksey = new Person("Алексей", 45);
        var elena = new Person("Елена",40)

        Relations gt = new Relations();

        gt.append(aleksandr, maria); //Связь муж-жена

        gt.append(aleksandr, aleksey); //Связь отец-ребенок
        gt.append(aleksandr, aleksey);
        gt.append(aleksandr, elena);

        gt.append(maria, aleksey); //Cвязь мать-ребенок
        gt.append(maria, elena);

        gt.append(aleksey, elena) //Связь брат-сестра

        System.out.println(new Search(gt).spend(elena, RelatedRelationship.child)); //Поиск родственной связи


    }
}
