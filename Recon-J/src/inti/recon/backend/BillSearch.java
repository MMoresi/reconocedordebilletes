package inti.recon.backend;

import java.util.List;

public interface BillSearch {
	String search(Billete needle, List<Billete> haystack);

	String search(BillImage needle, List<Bill> haystack);
}
