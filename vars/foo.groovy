def call(cmd, execPath=null) {
    echo "[Command]: "+cmd
    def sout = new StringBuffer()
    def serr = new StringBuffer()
    def proc = cmd.execute(null, execPath)
    proc.consumeProcessOutput(sout, serr)
    proc.waitFor();
    if(sout) echo "[Output]: "+sout.toString().trim()
    if(serr) error serr.toString().trim()
}
