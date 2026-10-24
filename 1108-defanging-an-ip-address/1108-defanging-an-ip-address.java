class Solution {
    public String defangIPaddr(String address) {
        
        String dot = ".";
        
            if(address.contains(dot)){
                address = address.replace(".", "[.]");
            }
        
        return address;
    }
}