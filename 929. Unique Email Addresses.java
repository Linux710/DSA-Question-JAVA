class Solution {
  
  // function to get valid emails and put it into set
    public int numUniqueEmails(String[] emails) {
        HashSet set = new HashSet<>();
        int total_valid_emails = 0;
        int len = emails.length;
        for(int i=0; i<len ; i++)
        {
            String updated_email = validEmail(emails[i]);
            set.add(updated_email);
            
        }
        
        total_valid_emails = set.size();
        return total_valid_emails;
        
    }
    
  // function to find valid email addresses  
    public String validEmail(String s)
    {
        String local_name = "";
        int i=0;
        int n = s.length();
        while( i<n && s.charAt(i) != '@')
        {
            if(s.charAt(i) == '.') i++;
            else if (s.charAt(i) == '+')
            {
                while(i<n && s.charAt(i) != '@')
                {
                    i++;
                }
            }
            
            else
            {
                local_name += s.charAt(i);
                i++;
            }
        }
        
        String domain_name = "";
        while(i<n)
        {
            domain_name += s.charAt(i);
            i++;
        }
        
        String valid_email_address = local_name + '@' + domain_name;
        
        return valid_email_address;
    }
    
}
