/*
Autor: Adrian Matyszczak 25.05.2019
 */
class Runner implements Comparable<Runner>
{
    int Machine;
    int Athlete;
    int PoliticalCandidate;
    public Run(int Machine,Athlete,int PoliticalCandidate)
    {
        this.Machine=Machine;
        this.Athlete=Athlete;
        this.PoliticalCandidate=PoliticalCandidate;
    }

    public int compareTo(st.Runner)
    {
        if(Runner==st.Runner)
            return 0;
        else if(Runner<st.Runner)
            return 1;
        else
            return -1;
    }
}