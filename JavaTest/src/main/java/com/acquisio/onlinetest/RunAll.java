package com.acquisio.onlinetest;

import com.acquisio.onlinetest.question01.FizzBuzz;
import com.acquisio.onlinetest.question02.TreeNavigation;
import com.acquisio.onlinetest.question03.ConvertToBinary;
import com.acquisio.onlinetest.question04.IssueResolving;
import com.acquisio.onlinetest.question05.Generics;
import com.acquisio.onlinetest.question06.Refactoring;
import com.acquisio.onlinetest.question07.Debugging;
import com.acquisio.onlinetest.question09.Sql1;
import com.acquisio.onlinetest.question10.Sql2;

import java.sql.SQLException;

/**
 * Description...
 *
 * @author Pierre-Luc Dupont (pldupont@acquisio.com)
 *         2016-12-08
 */
public class RunAll {
    public static void main(String[] args) throws SQLException {
        FizzBuzz.main(null);
        TreeNavigation.main(null);
        ConvertToBinary.main(null);
//        IssueResolving.main(null);
        Generics.main(null);
        Refactoring.main(null);
//        Debugging.main(null);
        Sql1.main(null);
        Sql2.main(null);
    }
}
