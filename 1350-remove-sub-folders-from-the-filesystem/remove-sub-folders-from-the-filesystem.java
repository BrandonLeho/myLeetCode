class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> output = new ArrayList<>();
        output.add(folder[0]);
        
        for (int i = 1; i < folder.length; i++) {
            String lastFolder = output.get(output.size() - 1) + "/";
            
            if (!folder[i].startsWith(lastFolder)) {
                output.add(folder[i]);
            }
        }
        return output;
    }
}