
public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Öğretmen kredisi hesaplandı");		
	}
	public void save() {
		System.out.println("javada virtual default Öğretmen kredisi kaydetme değişti");
	}

}
