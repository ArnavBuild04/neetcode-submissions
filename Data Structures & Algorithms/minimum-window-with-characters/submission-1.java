class Solution {
    public String minWindow(String s, String t) {
		//shortest window for a specific condition

		int i = 0, j = 0;
		int ansLen = Integer.MAX_VALUE;
		String ans = "";

		Map<Character,Integer> tmap = new HashMap<>();
		Map<Character,Integer> smap = new HashMap<>();

		for(char ch : t.toCharArray()) {
			tmap.put(ch,tmap.getOrDefault(ch,0)+1);
		}
		int need = tmap.size();

		while(j < s.length()) {

			if(tmap.containsKey(s.charAt(j))) {
				char ch = s.charAt(j);
				smap.put(ch,smap.getOrDefault(ch,0)+1);

                if(smap.get(s.charAt(j)).equals(tmap.get(s.charAt(j)))) {
				    need--;
			    }
			}


			while(need == 0 && i < j ) {
				char ch = s.charAt(i);
				if(!tmap.containsKey(ch)) {
                    i++;
                    continue;
                }

				if(smap.get(ch) > tmap.get(ch)) {
					smap.put(ch,smap.getOrDefault(ch,0)-1);
					i++;
				}
				else break;

			}

            if(need == 0 && ansLen > j-i+1) {
                ansLen = j-i+1;
				ans = s.substring(i,j+1);
			}


			j++;
		}


		return ans;
	}
}
