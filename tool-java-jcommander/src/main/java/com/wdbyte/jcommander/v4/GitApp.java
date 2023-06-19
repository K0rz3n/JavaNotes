package com.wdbyte.jcommander.v4;

import com.beust.jcommander.JCommander;

/**
 * @author https://www.wdbyte.com
 * @date 2023/06/15
 */
public class GitApp {

    public static void main(String[] args) {
        //args = new String[] {"clone", "ht2tp://www.wdbyte.com/test.git"};
        GitCommandOptions gitCommandOptions = new GitCommandOptions();
        GitCommandCommit commandCommit = new GitCommandCommit();
        JCommander commander = JCommander.newBuilder()
            .programName("git-app")
            .addObject(gitCommandOptions)
            .addCommand(commandCommit)
            .build();
        commander.parse(args);
        // 打印帮助信息
        if (gitCommandOptions.isHelp()) {
            commander.usage();
            return;
        }
        if (gitCommandOptions.isVersion()) {
            System.out.println("git version 2.24.3 (Apple Git-128)");
            return;
        }
        if (gitCommandOptions.getCloneUrl() != null) {
            System.out.println("clone " + gitCommandOptions.getCloneUrl());
        }
        String parsedCommand = commander.getParsedCommand();
        if ("commit".equals(parsedCommand)) {
            System.out.println(commandCommit.getComment());
        }
    }
}
