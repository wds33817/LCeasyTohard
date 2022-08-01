class Solution {
    public String defangIPaddr(String address) {
        //String add = String
        String pattern = "\\D";
        String res = address.replaceAll(pattern, "[.]");
        return res;
    }
}
