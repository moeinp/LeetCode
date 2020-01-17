package uniqueEmailAddresses;

import java.util.HashSet;
import java.util.Set;

class Solution {
	public int numUniqueEmails(String[] emails) {
		Set<String> unique = new HashSet<String>();
		for (int i = 0; i < emails.length; i++) {
			String domain = emails[i].substring(emails[i].indexOf('@'), emails[i].length());
			String local = emails[i].substring(0, emails[i].indexOf('@'));
			if (local.indexOf('+') != -1) {
				local = local.substring(0, local.indexOf('+'));
			}
			local = local.replace(".", "");
			unique.add(local + domain);
		}
		return unique.size();
	}
}