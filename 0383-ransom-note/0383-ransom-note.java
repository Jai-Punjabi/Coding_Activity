class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
		int buffer[] = new int[125];
		for(char ch : magazine.toCharArray())
			buffer[ch]++;
		for(char ch : ransomNote.toCharArray()) {
			if(buffer[ch]-- == 0) return false;
		}
		return true;
	}
}
